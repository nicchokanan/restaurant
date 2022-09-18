package th.ac.ku.restaurant.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Data //เพิ่ม getters สำหรับทุก fields เพิ่ม setters สำหรับทุก fields ที่ไม่เป็น final และเพิ่ม toString, equals and hashCode
@NoArgsConstructor //สร้าง constructor ที่ไม่มี arguments
@Entity
public class User { //เป็น class ที่จะ save ลง database

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    private String role;

}