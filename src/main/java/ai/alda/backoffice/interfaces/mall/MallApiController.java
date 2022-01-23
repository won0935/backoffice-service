package ai.alda.backoffice.interfaces.mall;

import ai.alda.backoffice.application.mall.MallFacade;
import ai.alda.backoffice.common.response.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import static ai.alda.backoffice.config.SwaggerConfig.BEARER_KEY_SECURITY_SCHEME;


@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/malls")
public class MallApiController {

    private final MallFacade mallFacade;
    private final MallRecordMapper mallRecordMapper;

    @GetMapping
    public CommonResponse getItems(@RequestParam String keyword, Pageable pageable) {
//        var items = mallFacade.getItems(keyword);
//        var response = mallRecordMapper.of(items);
//        return CommonResponse.success(response);
        return CommonResponse.success("ㅇㅇ");
    }


    @GetMapping("/{id}")
    public CommonResponse getItem(@PathVariable Long id) {
//        var partnerToken = new MallDto.LoanSearchRequest().
//        var itemCommand = MallDtoMapper.of(request);
//        var itemToken = mallFacade.registerItem(itemCommand, partnerToken);
//        var response = MallDtoMapper.of(itemToken);
        return CommonResponse.success("ㅇㅇ");
    }

    @PostMapping()
    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
    public CommonResponse get() {
//        var partnerToken = new MallDto.LoanSearchRequest().
//        var itemCommand = MallDtoMapper.of(request);
//        var itemToken = mallFacade.registerItem(itemCommand, partnerToken);
//        var response = MallDtoMapper.of(itemToken);
        return CommonResponse.success("ㅇㅇ");
    }
//
//
//    @PostMapping
//    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
//    public CommonResponse registerItem(@RequestBody @Valid MallDto.RegisterItemRequest request) {
//        var partnerToken = request.getPartnerToken();
//        var itemCommand = MallDtoMapper.of(request);
//        var itemToken = mallFacade.registerItem(itemCommand, partnerToken);
//        var response = MallDtoMapper.of(itemToken);
//        return CommonResponse.success(response);
//    }
//
//    @PutMapping
//    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
//    public CommonResponse updateItem(@RequestBody @Valid MallDto.RegisterItemRequest request) {
//        var partnerToken = request.getPartnerToken();
//        var itemCommand = MallDtoMapper.of(request);
//        var itemToken = mallFacade.registerItem(itemCommand, partnerToken);
//        var response = MallDtoMapper.of(itemToken);
//        return CommonResponse.success(response);
//    }
//
//    @DeleteMapping("/{id}")
//    @Operation(security = {@SecurityRequirement(name = BEARER_KEY_SECURITY_SCHEME)})
//    public CommonResponse deleteItem(@PathVariable Long id) {
//        var partnerToken = request.getPartnerToken();
//        var itemCommand = MallDtoMapper.of(request);
//        var itemToken = mallFacade.registerItem(itemCommand, partnerToken);
//        var response = MallDtoMapper.of(itemToken);
//        return CommonResponse.success(response);
//    }
}