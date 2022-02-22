import java.util.Scanner;

public class VideoStore extends Video {
     
    Video v[] = new Video[10];

    static int i = 0;

    void addVideo(String title,int len,String subtitle)
//in the above function we have passed len as parameter to take movie length
    {

        v[i] = new Video();

        this.title = title;
        
        this.len = len;//this will take the length from the user and by this function we are adding it to object
        v[i].len=len;//object array will store the length accordingly
         
        this.subtitle = subtitle;//this will give us in the end in how many language we can see subtitle of movie
        v[i].subtitle = subtitle;

        v[i].title = title;
        i++;

        System.out.println("Video Added Successfully");

    }

    void checkOut(String title)

    {

        for (int k = 0; k < i; k++)

        {

            if (v[k].title.equalsIgnoreCase(title)) {

                if (v[k].checked()) {

                    v[k].rent();

                    System.out.println("Video is rented");

                }

                else {

                    System.out.println("Sorry Video not available");

                }

            }

        }

    }

    void returnVideo(String title) {

        if (i == 0)

        {

            System.out.println("You have no video to return");

        }

        for (int k = 0; k < i; k++)

        {

            if (v[k].title.equalsIgnoreCase(title)) {

                v[k].checked = true;

            }

        }

    }

    public void receiveRating()

    {

        if (i == 0) {

            System.out.println("No Video inInventory");

        }

        else {

            for (int k = 0; k < i; k++)

            {

                System.out.println("Enter the rating for movie: " + v[k].title);

                Scanner ob = new Scanner(System.in);

                v[k].avgrating = ob.nextInt();

            }

        }

    }

    public void listInventory() {

        if (i == 0)

        {

            System.out.println("No Video in Inventory");

        }

        else

        {

            for (int k = 0; k < i; k++)

            {

                System.out.println(k + 1 + ". Movie:   " + v[k].title + "\n" +  "   Rating:   " + v[k].avgrating+"\n" + "   Availability:   "
                        + v[k].checked()+"\n"+ "   length :   "+v[k].len+"hrs"+"\n" + "   Subtitle:   "+subtitle);

            }

        }

    }

}
