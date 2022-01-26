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
        NONE("결과없음"),
        FIRST("1금융"),
        SECOND_MID("2금융_중금리"),
        SECOND_HIGH("2금융_고금리"),
        SAITDOL_TWO("사잇돌2"),
        HAESSAL("햇살");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum LoanGroup {
        RECOMMEND("추천"),
        CREDIT("신용카드"),
        MORTGAGE("주택담보"),
        GOVERNMENT("정부지원"),
        P2P("P2P"),
        CAR("자동차담보");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum ServiceStatus {

        ENABLE("활성"),
        DISABLE("비활성"),
        DELETE("삭제");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum DisplayType {
        BANNER("배너"),
        LIST("목록"),
        EVENT("이벤트"),
        CREDIT_REPORT("신용보고서");

        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum ReviewType {
        LOAN("대출"),
        CARD("카드"),
        CARD_EVENT("카드 이벤트");

        private final String description;
    }
}
