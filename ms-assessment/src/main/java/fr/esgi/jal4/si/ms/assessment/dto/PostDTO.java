package fr.esgi.jal4.si.ms.assessment.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PostDTO {
    @NotNull(message = "{str1.notNull}")
    @NotBlank
    public String str1;
    @NotNull(message = "{str2.notNull}")
    @NotBlank
    public String str2;
}
