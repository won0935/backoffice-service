package ai.alda.backoffice.interfaces.mall;

import ai.alda.backoffice.application.mall.MallFacade;
import ai.alda.backoffice.common.response.ResultResponse;
import ai.alda.backoffice.common.util.PageContents;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@GraphQLApi
@Service
@RequiredArgsConstructor
public class MallApiQraphQL {

    private final MallFacade mallFacade;
    private final MallRecordMapper mapper;


    @GraphQLQuery(name = "getLoanList", description = "상품몰 상품 리스트 조회")
    public ResultResponse<PageContents<MallDto.Loan>> getLoanList(MallDto.SearchLoanRequest loanSearchRequest) {
        var request = mapper.of(loanSearchRequest);
        var value = mallFacade.getLoanList(request);
        var response = mapper.of(value);
        return new ResultResponse(response);
    }

    @GraphQLQuery(name = "getLoan", description = "상품몰 상품 단건 조회")
    public ResultResponse<PageContents<MallDto.Loan>> getLoan(Long id) {
        var value = mallFacade.getLoan(id);
        var response = mapper.of(value);
        return new ResultResponse(response);
    }
}
