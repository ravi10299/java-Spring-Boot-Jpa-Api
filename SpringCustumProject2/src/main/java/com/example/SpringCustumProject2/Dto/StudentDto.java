package com.example.SpringCustumProject2.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    @NotNull(message = "invalid name details...")
    private String name;
   @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number")
    private String mobileNo;
   @Pattern(regexp = "^[MF]$",message = "invalid...")
   private String gender;
   @Min(value = 21,message = "invalid age....")
   @Max(value = 45,message = "invalid....")
    private int age;
    @Column(length = 30)
    private String college;
    @Column(length = 30)
    @Email(message = "invalid Emails.....")
    @NotNull(message = "invalid Email.....")
    private String email;
    @Column(length = 50)
    private String address;

}
