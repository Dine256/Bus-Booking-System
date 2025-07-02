import java.util.Scanner;

public class Passengers {

    String name;
    int age;
    String gender;

    public Passengers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println(name +"|" + age+ "|" + gender);
    }

    public static class busbooking {

        static Passengers[] seats = new Passengers[54];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("1.Bus Book");
                System.out.println("2.Seat details");
                System.out.println("3.Existing");
                System.out.println("4.Buses");

                System.out.println("Enter your choice :");
                choice = sc.nextInt();

                switch (choice){
                    case 1 -> busbook(sc);
                    case 2->seatdet();
                    case 3-> System.out.println("existing");
                    default -> System.out.println("Invaild");
                }

            }while(choice!=3);
        }

        static void busbook(Scanner sc){

            System.out.println("Seat Preference" +
                    " 1.window " +
                    " 2.normal");
            int preference=sc.nextInt();
            Seatpre(preference);

            System.out.println("Enter your Seatnumber");
            int snum=sc.nextInt();

            if(snum <1 || snum>54){
                System.out.println("invalid");
            }

            if(seats[snum-1]!=null){
                System.out.println("No seat");
            }
            System.out.println("Enter Name :");
            String name=sc.next();

            System.out.println("Enter Age :");
            int age= sc.nextInt();

            System.out.println("Enter Gender M/F:");
            String gender= sc.next();





            seats[snum-1]=new Passengers(name,age,gender);
            System.out.println("seat "+snum+" booked");
        }

        static void seatdet(){
            for(int i=0;i<seats.length;i++){
                System.out.print("seat "+(i+1)+":");
                if(seats[i]==null)
                    System.out.println("available");
                else
                    seats[i].display();
            }
        }

        static void Seatpre(int pre){
            for(int i=1;i< seats.length;i++){

                if(pre==1){
                    if(i%4==1){
                        System.out.println("window :"+i);
                    }
                    if(i%4==0){
                        System.out.println("window :"+i);
                    }
                }
                else if(pre==2) {
                    if(i%4==1){
                        continue;
                    }
                    if(i%4==0){
                        continue;
                    }
                    else
                        System.out.println("normal :"+i);
                }
            }
        }
    }
}