package sg.edu.rp.c346.id21018193.demodatabase;

import androidx.annotation.NonNull;

public class Tasks {
    private int id;
    private String description;
    private String date;

    public Tasks(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() { return id; }

    public String getDescription() { return description; }

    public String getDate() { return date;}

   @NonNull
    @Override
   public String toString() {
       return id + "\n" + description + "\n" + date;
   }
}
