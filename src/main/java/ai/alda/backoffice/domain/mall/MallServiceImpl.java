package ai.alda.backoffice.domain.mall;

import ai.alda.backoffice.common.util.PageContents;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class MallServiceImpl implements MallService {

    private final MallApiCaller mallApiCaller;

    @Override
    public PageContents<MallCommand.Loan> getLoanList(MallCommand.SearchLoanRequest request) {
        return mallApiCaller.getLoanList(request);
    }

    @Override
    public MallCommand.Loan getLoan(Long id) {
        return mallApiCaller.getLoan(id);
    }

    @Override
    public MallCommand.Loan editLoan(MallCommand.Loan loanManageModel) {
        return mallApiCaller.editLoan(loanManageModel);
    }

    @Override
    public Long addLoan(MallCommand.Loan loanManageModel) {
        return mallApiCaller.addLoan(loanManageModel);
    }
}
