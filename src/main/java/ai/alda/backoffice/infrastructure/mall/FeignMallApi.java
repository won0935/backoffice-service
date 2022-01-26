package ai.alda.backoffice.infrastructure.mall;


import ai.alda.backoffice.common.response.ResultResponse;
import ai.alda.backoffice.common.util.PageContents;
import ai.alda.backoffice.domain.mall.MallCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

//@FeignClient(name = "MALL-SERVICE")
@FeignClient(name = "feign", url = "http://localhost:8070")
public interface FeignMallApi {

    @GetMapping("internal/backoffice/mall/loans")
    ResultResponse<PageContents<MallCommand.Loan>> getLoanList(@SpringQueryMap MallCommand.SearchLoanRequest request);

    @GetMapping("internal/backoffice/mall/loans/{id}")
    ResultResponse<MallCommand.Loan> getLoan(@PathVariable("id") Long id);

    @PutMapping("internal/backoffice/mall/loans")
    ResultResponse<MallCommand.Loan> editLoan(@RequestBody MallCommand.Loan loanManageModel);

    @PostMapping("internal/backoffice/mall/loans/add")
    ResultResponse<Long> addLoan(@RequestBody MallCommand.Loan loanManageModel);
}
