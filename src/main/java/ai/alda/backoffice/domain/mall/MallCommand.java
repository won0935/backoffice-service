package ai.alda.backoffice.domain.mall;

import ai.alda.backoffice.interfaces.mall.MallDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

public class MallCommand {

    @Getter
    @Builder
    @ToString
    public static class SearchLoanRequest {
        private String fromDate;
        private String toDate;
        private String keywordFlag;
        private String keyword;
        private int offset;
        private int limit;
        private MallDto.LoanCategory category;
        private MallDto.LoanGroup group;
        private MallDto.ServiceStatus status;
        private MallDto.DisplayType displayType;
    }

    @Getter
    @Setter
    @ToString
    public static class Loan {
        private Long id; //
        private String companyName;
        private String name;
        private String description;
        private String detailYn;
        private String homepageUrl;
        private MallDto.LoanGroup group;
        private MallDto.LoanCategory category;
        private MallDto.LoanGroup type;
        private int minPeriod;
        private int maxPeriod;
        private BigDecimal minInterestRate;
        private BigDecimal maxInterestRate;
        private String minInterestRateDesc;
        private String maxInterestRateDesc;
        private String overdue;
        private int minLimit;
        private int maxLimit;
        private String repayment;
        private String interestPayment;
        private String fee;
        private String stampDuty;
        private String document;
        private String memo;
        private List<MallDto.Review> reviewList;
        private String tel;
        private String specialCondition;
        private String requestTarget;
        private String accessType;
        private String etcMemo;
        private String eventTitle;
    }
}
