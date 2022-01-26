package ai.alda.backoffice.infrastructure.mall;

import ai.alda.backoffice.common.util.PageContents;
import ai.alda.backoffice.domain.mall.MallApiCaller;
import ai.alda.backoffice.domain.mall.MallCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class MallApiCallerImpl implements MallApiCaller {

    private final FeignMallApi feignMallApi;

    @Override
    public PageContents<MallCommand.Loan> getLoanList(MallCommand.SearchLoanRequest request) {
        return feignMallApi.getLoanList(request).getResult();
    }

    @Override
    public MallCommand.Loan getLoan(Long id) {
        return feignMallApi.getLoan(id).getResult();
    }

    @Override
    public MallCommand.Loan editLoan(MallCommand.Loan loanManageModel) {
        return feignMallApi.editLoan(loanManageModel).getResult();
    }

    @Override
    public Long addLoan(MallCommand.Loan loanManageModel) {
        return feignMallApi.addLoan(loanManageModel).getResult();
    }
}
