package ai.alda.backoffice.interfaces.mall;

import ai.alda.backoffice.application.mall.MallFacade;
import ai.alda.backoffice.common.response.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;


import static ai.alda.backoffice.config.SwaggerConfig.BEARER_KEY_SECURITY_SCHEME;


@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/malls")
public class MallApiController {

    private final MallFacade mallFacade;
    private final MallRecordMapper mapper;


    @PostMapping("/loan")
    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
    public ResultResponse<Long> addLoan(
            @RequestBody MallDto.Loan loan) {
//        String name = ((KeycloakPrincipal<?>) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getName();
        var request = mapper.of(loan);
        var response = mallFacade.addLoan(request);

        return new ResultResponse(response);
    }

    @PutMapping("/loan")
    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
    public ResultResponse<MallDto.Loan> editLoan(
            @RequestBody MallDto.Loan loan) {

        var request = mapper.of(loan);
        var response = mallFacade.editLoan(request);

        return new ResultResponse(response);
    }


}