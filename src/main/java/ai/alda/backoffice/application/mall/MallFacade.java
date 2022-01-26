package ai.alda.backoffice.application.mall;

import ai.alda.backoffice.common.util.PageContents;
import ai.alda.backoffice.domain.mall.MallCommand;
import ai.alda.backoffice.domain.mall.MallService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class MallFacade {
    private final MallService mallService;


    public PageContents<MallCommand.Loan> getLoanList(MallCommand.SearchLoanRequest loanSearchRequest) {
        return mallService.getLoanList(loanSearchRequest);
    }

    public MallCommand.Loan getLoan(Long id) {
        return mallService.getLoan(id);
    }

    public Long addLoan(MallCommand.Loan loanManageModel) {
        return mallService.addLoan(loanManageModel);
    }

    public MallCommand.Loan editLoan(MallCommand.Loan loanManageModel) {
        return mallService.editLoan(loanManageModel);
    }
}
