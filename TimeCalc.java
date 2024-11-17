public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes - (totalHours * 60);

        String h = "";
        String m = "";

        if(newHours < 10){
            h = "0" + newHours;
        } else{
            h = "" + newHours;
        }
        if(newMinutes < 10){
            m = "0" + newMinutes;
        } else{
            m = "" + newMinutes;
        }

        System.out.println(h + ":" + m);


    }
}
