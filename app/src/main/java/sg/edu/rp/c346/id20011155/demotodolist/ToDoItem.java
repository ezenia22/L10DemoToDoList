package sg.edu.rp.c346.id20011155.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        Date date = this.date.getTime();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy (EEEE)");
        String date1 = format1.format(date);

        SimpleDateFormat format2 = new SimpleDateFormat("EEEE");
        String day = format2.format(date);

        String str = date1;

        return str;
    }
}
