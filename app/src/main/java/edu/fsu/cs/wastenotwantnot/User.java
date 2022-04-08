package edu.fsu.cs.wastenotwantnot;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
// TODO: uncomment following to ensure unique user name and email address

/*        ,
        indices = {@Index(value = {"user_name"},unique = true),
                @Index(value = {"email"},unique = true)})*/
public class User {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;

    // TODO: if primary key is autogenerated why do we need a setter?
    public void setId (int new_id) {
        this.id = new_id;
    }

    public int getId () {
        return this.id;
    }

    // TODO: uncomment this block and create setters and getters
/*    @NonNull
    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "email")
    private String emailAddress;*/

    // TODO: physical address

    // TODO: password (encryption, best practices, etc)

    // TODO: getters / setters
}
