package project.dto;

import entity.JobPost;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
public class JobPostForm {

    public JobPostForm(String title, String position, int companyNo, String career, String degree, double salary, String detail, LocalDate endDate) {
        this.title = title;
        this.position = position;
        this.companyNo = companyNo;
        this.career = career;
        this.degree = degree;
        this.salary = salary;
        this.detail = detail;
        this.endDate = endDate;
    }

    private String title;
    private String position;
    private int companyNo;
    private String career;
    private String degree;
    private double salary;
    private String detail;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate endDate;

    public void checkForm() {
        if(title == null || position == null || detail == null || career == null || degree == null) {
            throw new NullPointerException("채용공고 필수 입력 칸이 비어있습니다.");
        }
    }
}
