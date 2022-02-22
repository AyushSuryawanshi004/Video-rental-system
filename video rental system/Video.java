import java.util.Scanner;

public class Video {

    public String title;
    public int len;
    public String subtitle;
    public boolean checked = true;

    int avgrating;

    public boolean checked()

    {

        return checked;

    }

    public void rent() {

        checked = false;

    }

    public void returned()

    {

        checked = true;

        System.out.println("Video is returned ");

    }

    public int getRating()

    {

        if (avgrating > 0)

        {

            return avgrating;

        } else {

            System.out.println(" Rating is not available");

            return 0;

        }

    }

}
