import java.util.*;

class Bus {

    static String[] seats = new String[30];
    static final double ticketprice = 2000;
    static String date = "30-10-2024 9:00am";
    static String hault = "JM Road Deccan Near Qspider";
    static String[] drops={"Deccan","Swarget","Saswad","Hadspar","kharadi","Yelewadi"};
    static double [] fares={0,30,70,120,170,220,300};
    static final String busNumber = "MH12AA1234";
    static double totalColl;
    static Passenger obj;

    static {
        Arrays.fill(seats, "AVAIL");
    }
    static{
        System.out.println("No REFUNDS");
    }
    public void cancelTicket(Scanner sc,Long contact){
        if(obj!=null){
            if(contact==obj.getCont()){
                System.out.println("Are you Sure(YES/NO) :");
                String resp=sc.next();
                if(resp.equalsIgnoreCase("YES")){
                    seats[obj.getseatNumber()-1]="AVAIL";
                    obj=null;
                    System.out.println("Ticket Cancelled");
                }
            }
            else{
                System.out.println("Wrong Contact");
            }
        }
        else{
            System.out.println("BOOK Your ticket First");
        }
    }

    static void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println((i + 1) + "->" + seats[i] + "  ");
        }
        System.out.println();
    }
    public void seatBook(Scanner sc){
        System.out.println("Seat Booking Module");
        System.out.println();
        System.out.println("Boarding :");
        String boarding=sc.next();
        System.out.println("Destination :");
        String dest=sc.next();

        for(; ;){

    

   public static void bookSeat(int seatNumber) {
        if (!(seatNumber < 1 && seatNumber > 30)) {
            if (seats[seatNumber - 1] == "AVAIL") {
                seats[seatNumber - 1] = "BOOKED";
                createPassenger(sc,boarding,dest,seatNumber);
                break;
            }
            } else {
                System.out.println("SEAT OCCUPIED");
            }
        } else {
            System.out.println("WRONG SEAT NUMBER ENTERED");
        }
    }
 }
    static void payment() {
        System.out.println("PAYMENT CONFIRMED");
        System.out.println("BOOKING DETAILS");
        System.out.println("Bus Number :" + busNumber);
        System.out.println("Date & Time :" + date);
        System.out.println("Hault :" + hault);
        Passenger copy = BookMyBusDriver.obj;
        System.out.println("Passsenger Name :" + copy.getName());
        System.out.println("Passenger Gender :" + copy.getGender());
        System.out.println("Passenger Contact :" + copy.getCont());
        System.out.println("Passenger bording :" + copy.getBoarding());
        System.out.println("Passenger Destination :" + copy.getDest());
        System.out.println("");
        System.out.println("HAPPY JOURNEY GO HOME & HAPPY DIWALI");
    }
}

class Passenger {
    private String name;
    private String gender;
    private long contact;
    private String boarding;
    private String dest;

    Passenger(String name, String gender, long contact, String boarding, String dest) {
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.boarding = boarding;
        this.dest = dest;
    }

    public int getseatNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getseatNumber'");
    }

    String getName() {
        return this.name;
    }

    private void setName(String newName) {
        this.name = newName;
    }

    String getGender() {
        return this.gender;
    }

    long getCont() {
        return this.contact;
    }

    private void setCont(long newCont) {
        this.contact = newCont;
    }

    String getBoarding() {
        return this.boarding;
    }

    String getDest() {
        return this.dest;
    }

    private void setDest(String newDest) {
        this.dest = newDest;
    }

}

class BookMyBusDriver {
    static Passenger obj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Book My BUS");
        for (;;) {
            System.out.print("Passenger Name :");
            String name = sc.nextLine();
            System.out.print("Gender :");
            String gender = sc.next();
            System.out.print("Contact :");
            long contact = sc.nextLong();
            System.out.print("boarding point :");
            sc.nextLine();
            String boarding = sc.nextLine();
            System.out.print("Destination :");
            String dest = sc.nextLine();

            obj = new Passenger(name, gender, contact, boarding, dest);

            Bus bus = new Bus();
            System.out.println();
            bus.displaySeats();
            System.out.println("Enter the seat number :");
            int seatNumber = sc.nextInt();
            bus.bookSeat(seatNumber);

        }
    }
}