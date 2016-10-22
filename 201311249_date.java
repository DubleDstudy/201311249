String dayStr;
switch(day){
case 1: dayStr = "Sunday";
break;
case 2: dayStr = "Monday";
break;
case 3: dayStr = "Tuesday";
break;
case 4: dayStr = "Wednesday";
break;
case 5: dayStr = "Thursday";
break;
case 6: dayStr = "Friday";
break;
case 7:dayStr = "Saturday";
break;
default:dayStr = "Invalid month";
break;
}
System.out.println(dayStr);
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THUSDAY,FRIDAY,SATURDAY
}
day=Day.MONDAY;
day=Day.MONDAY;
Day day;
day=Day.MONDAY;
String msg=null;
switch(day){
case MONDAY:
case TUESDAY:
case WEDNESDAY:
case THUSDAY:
case FRIDAY : msg="schooling"; break;
case SATURDAY:
case SUNDAY: msg="off";break;
default: msg="what is today?"; break;
}
System.out.println(msg);
for(Day d:Day.values())
System.out.println(d);