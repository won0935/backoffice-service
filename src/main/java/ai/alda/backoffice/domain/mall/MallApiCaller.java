package ai.alda.backoffice.domain.mall;

import ai.alda.backoffice.common.util.PageContents;

public interface MallApiCaller {
    PageContents<MallCommand.Loan> getLoanList(MallCommand.SearchLoanRequest request);

    MallCommand.Loan getLoan(Long id);

    MallCommand.Loan editLoan(MallCommand.Loan loanManageModel);

    Long addLoan(MallCommand.Loan loanManageModel);
}
