package ai.alda.backoffice.interfaces.mall;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

public class MallDto {

    @Getter
    @Setter
    @ToString
    public static class SearchLoanRequest {
        private String fromDate;
        private String toDate;
        private String keywordFlag;
        private String keyword;
        private int offset;
        private int limit;
        private LoanCategory category;
        private LoanGroup group;
        private ServiceStatus status;
        private DisplayType displayType;
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
        private LoanGroup group;
        private LoanCategory category;
        private LoanGroup type;
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
        private List<Review> reviewList;
        private String tel;
        private String specialCondition;
        private String requestTarget;
        private String accessType;
        private String etcMemo;
        private String eventTitle;
    }

    @Getter
    @Setter
    @ToString
    public static class Review {
        private Long id;
        private ReviewType type;
        private String deliberationNumber;
    }

    @Getter
    @AllArgsConstructor
    public enum LoanCategory {
        NONE("????????????"),
        FIRST("1??????"),
        SECOND_MID("2??????_?????????"),
        SECOND_HIGH("2??????_?????????"),
        SAITDOL_TWO("?????????2"),
        HAESSAL("??????");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum LoanGroup {
        RECOMMEND("??????"),
        CREDIT("????????????"),
        MORTGAGE("????????????"),
        GOVERNMENT("????????????"),
        P2P("P2P"),
        CAR("???????????????");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum ServiceStatus {

        ENABLE("??????"),
        DISABLE("?????????"),
        DELETE("??????");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum DisplayType {
        BANNER("??????"),
        LIST("??????"),
        EVENT("?????????"),
        CREDIT_REPORT("???????????????");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum ReviewType {
        LOAN("??????"),
        CARD("??????"),
        CARD_EVENT("?????? ?????????");

        private final String description;
    }
}
