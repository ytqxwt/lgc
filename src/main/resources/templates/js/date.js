//
// //生成日期
// function creatDate()
// {
//     //生成1900年-2100年
//     for(var i = 2050; i >= 1910; i--)
//     {
//         //创建select项
//         var option = document.createElement('option');
//         option.setAttribute('value',i);
//         option.innerHTML = i;
//         sel1.appendChild(option);
//         canJiaGongZuo1.appendChild(option);
//     }
//     //生成1月-12月
//     for(var i = 1; i <=12; i++){
//         var option1 = document.createElement('option');
//         option1.setAttribute('value',i);
//         option1.innerHTML = i;
//         sel2.appendChild(option1);
//         canJiaGongZuo2.appendChild(option1);
//     }
//     //生成1日—31日
//     for(var i = 1; i <=31; i++){
//         var option2 = document.createElement('option');
//         option2.setAttribute('value',i);
//         option2.innerHTML = i;
//         sel3.appendChild(option2);
//         canJiaGongZuo3.appendChild(option2);
//     }
// }
// creatDate();
// //保存某年某月的天数
// var days;
//
// //年份点击 绑定函数
// sel1.onclick =yuefen() ;
// canJiaGongZuo1.onclick=yuefen();
//
//
//
//
// function yuefen()
// {
//     //月份显示默认值
//     sel2.options[0].selected = true;
//     canJiaGongZuo2.options[0].selected = true;
//     //天数显示默认值
//     sel3.options[0].selected = true;
//     canJiaGongZuo3.options[0].selected = true;
// }
// //月份点击 绑定函数
// sel2.onclick = tianshu();
// canJiaGongZuo12.onclick=tianshu();
//
//     function tianshu()
// {
//     //天数显示默认值
//     sel3.options[0].selected = true;
//     canJiaGongZuo3.options[0].selected = true;
//     //计算天数的显示范围
//     //如果是2月
//     if(sel2.value == 2)
//     {
//         //判断闰年
//         if((sel1.value % 4 === 0 && sel1.value % 100 !== 0)  || sel1.value % 400 === 0)
//         {
//             days = 29;
//         }
//         else
//         {
//             days = 28;
//         }
//         //判断小月
//     }else if(sel2.value == 4 || sel2.value == 6 ||sel2.value == 9 ||sel2.value == 11){
//         days = 30;
//     }else{
//         days = 31;
//     }
//
//     //增加或删除天数
//     //如果是28天，则删除29、30、31天(即使他们不存在也不报错)
//     if(days == 28){
//         sel3.remove(31);
//         sel3.remove(30);
//         sel3.remove(29);
//     }
//     //如果是29天
//     if(days == 29){
//         sel3.remove(31);
//         sel3.remove(30);
//         //如果第29天不存在，则添加第29天
//         if(!sel3.options[29]){
//             sel3.add(new Option('29','29'),null)
//         }
//     }
//     //如果是30天
//     if(days == 30){
//         sel3.remove(31);
//         //如果第29天不存在，则添加第29天
//         if(!sel3.options[29]){
//             sel3.add(new Option('29','29'),null)
//         }
//         //如果第30天不存在，则添加第30天
//         if(!sel3.options[30]){
//             sel3.add(new Option('30','30'),null)
//         }
//     }
//     //如果是31天
//     if(days == 31){
//         //如果第29天不存在，则添加第29天
//         if(!sel3.options[29])
//         {
//             sel3.add(new Option('29','29'),null)
//         }
//         //如果第30天不存在，则添加第30天
//         if(!sel3.options[30])
//         {
//             sel3.add(new Option('30','30'),null)
//         }
//         //如果第31天不存在，则添加第31天
//         if(!sel3.options[31])
//         {
//             sel3.add(new Option('31','31'),null)
//         }
//     }
// }

/*
 * jQuery Date Selector Plugin
 * 日期联动选择插件
 *
 * Demo:
        $("#calendar").DateSelector({
                ctlYearId: <年控件id>,
                ctlMonthId: <月控件id>,
                ctlDayId: <日控件id>,
                defYear: <默认年>,
                defMonth: <默认月>,
                defDay: <默认日>,
                minYear: <最小年|默认为1882年>,
                maxYear: <最大年|默认为本年>
        });

   HTML:<div id="calendar"><SELECT id=idYear></SELECT>年 <SELECT id=idMonth></SELECT>月 <SELECT id=idDay></SELECT>日</div>
 */
(function ($) {
    //SELECT控件设置函数
    function setSelectControl(oSelect, iStart, iLength, iIndex) {
        oSelect.empty();
        for (var i = 0; i < iLength; i++) {
            if ((parseInt(iStart) + i) == iIndex)
                oSelect.append("<option selected='selected' value='" + (parseInt(iStart) + i) + "'>" + (parseInt(iStart) + i) + "</option>");
            else
                oSelect.append("<option value='" + (parseInt(iStart) + i) + "'>" + (parseInt(iStart) + i) + "</option>");
        }
    }

    $.fn.DateSelector = function (options) {
        options = options || {};

        //初始化
        this._options = {
            ctlYearId: null,
            ctlMonthId: null,
            ctlDayId: null,
            defYear: 0,
            defMonth: 0,
            defDay: 0,
            minYear: 1882,
            maxYear: new Date().getFullYear()
        };

        for (var property in options) {
            this._options[property] = options[property];
        }

        this.yearValueId = $("#" + this._options.ctlYearId);
        this.monthValueId = $("#" + this._options.ctlMonthId);
        this.dayValueId = $("#" + this._options.ctlDayId);

        var dt = new Date(),
            iMonth = parseInt(this.monthValueId.attr("data") || this._options.defMonth),
            iDay = parseInt(this.dayValueId.attr("data") || this._options.defDay),
            iMinYear = parseInt(this._options.minYear),
            iMaxYear = parseInt(this._options.maxYear);

        this.Year = parseInt(this.yearValueId.attr("data") || this._options.defYear) || dt.getFullYear();
        this.Month = 1 <= iMonth && iMonth <= 12 ? iMonth : dt.getMonth() + 1;
        this.Day = iDay > 0 ? iDay : dt.getDate();
        this.minYear = iMinYear && iMinYear < this.Year ? iMinYear : this.Year;
        this.maxYear = iMaxYear && iMaxYear > this.Year ? iMaxYear : this.Year;

        //初始化控件
        //设置年
        setSelectControl(this.yearValueId, this.minYear, this.maxYear - this.minYear + 1, this.Year);
        //设置月
        setSelectControl(this.monthValueId, 1, 12, this.Month);
        //设置日
        var daysInMonth = new Date(this.Year, this.Month, 0).getDate(); //获取指定年月的当月天数[new Date(year, month, 0).getDate()]
      if (this.Day > daysInMonth) {
        this.Day = daysInMonth;
      }
      setSelectControl(this.dayValueId, 1, daysInMonth, this.Day);

        var oThis = this;
        //绑定控件事件
        this.yearValueId.change(function () {
            oThis.Year = $(this).val();
            setSelectControl(oThis.monthValueId, 1, 12, oThis.Month);
            oThis.monthValueId.change();
        });
        this.monthValueId.change(function () {
            oThis.Month = $(this).val();
            var daysInMonth = new Date(oThis.Year, oThis.Month, 0).getDate();
          if (oThis.Day > daysInMonth) {
            oThis.Day = daysInMonth;
          }
          setSelectControl(oThis.dayValueId, 1, daysInMonth, oThis.Day);
        });
        this.dayValueId.change(function () {
            oThis.Day = $(this).val();
        });
    }
})(jQuery);

