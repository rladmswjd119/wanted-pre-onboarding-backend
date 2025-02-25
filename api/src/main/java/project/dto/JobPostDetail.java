package project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class JobPostDetail {
    public JobPostDetail(int no, String title, String position, String career, String degree, double salary, String detail, LocalDate endDate
                        , String companyName, String homePage, String address) {
        this.no = no;
        this.title = title;
        this.position = position;
        this.career = career;
        this.degree = degree;
        this.salary = salary;
        this.detail = detail;
        this.endDate = endDate;
        this.companyName = companyName;
        this.homePage = homePage;
        this.address = address;
    }

    private int no;
    private String title;
    private String position;
    private String career;
    private String degree;
    private double salary;
    private String detail;
    private LocalDate endDate;
    private String companyName;
    private String homePage;
    private String address;
}
