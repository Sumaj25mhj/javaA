public class hi {
    public static void main(String[] args) {
            // String day, month;
            // int date, year;
            // day = "Wednesday";
            // month = "February";
            // date = 19;
            // year = 2025;
            // System.out.println("Date in American format:" + day + ", " + month + " " + date + " " + year);
            // System.out.println("Date in European format:" + day + " " + date + " " + month + " " + year);
            // System.out.println("Date in Japanese format:" + year + " " + month + " " + date + " " + day);


            // String firstname = "Sumaj";
            // String lastname = "Maharjan";
            // String fullname = firstname + " " + lastname;
            // System.out.println("Hello, my name is " + fullname);

            // double ferenheit;
            // ferenheit = 77.5;
            // double celsius;
            // celsius =(ferenheit-32) * 5 / 9;
            // System.out.println("celsius: " + celsius);

            String Storename = "Stationary Store";
            String adress = "123 Latrobe Street, Melbourne, VIC 3000";
            String contact = "0432 123 456";
            String item1 = "book";
            String item2 = "pen";
            String item3 = "eraser";

            double price1 = 9.99;
            double price2 = 15.99;   
            double price3 = 1.29;
            double total = price1 + price2 + price3;
            double GST = (total) * 10/100;  

            
            System.out.println(Storename + "\n"  + adress + "\n" + contact);
            System.out.println("Date: 19/02/2025" + "\n" + "Time: 10:00 AM");

            System.out.println("TAX INVOICE");
            System.out.println("Items purchased:" + "\n" + item1 +": "+ price1 + "\n" + item2 +": "+ price2 + "\n" + item3 + ": " +price3);
            System.out.println("Total cost: $" + total);
            System.out.println("GST:" + (total) * 10/100);
            System.out.println("Total cost with GST: $" + total + (10/100) * total);

            // I  
            // P item1 + item 2 + item3 = total cost 
            // O
    }

}