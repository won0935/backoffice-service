package ai.alda.backoffice.interfaces.mall;

import ai.alda.backoffice.common.util.PageContents;
import ai.alda.backoffice.domain.mall.MallCommand;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface MallRecordMapper {

    // register
//    @Mappings({@Mapping(source = "request.itemOptionGroupList", target = "itemOptionGroupRequestList")})
//    MallCommand.RegisterItemRequest of(MallDto.RegisterItemRequest request);
//
//    @Mappings({@Mapping(source = "itemOptionList", target = "itemOptionRequestList")})
//    MallCommand.RegisterItemOptionGroupRequest of(MallDto.RegisterItemOptionGroupRequest request);
//
//    MallCommand.RegisterItemOptionRequest of(MallDto.RegisterItemOptionRequest request);
//
//    MallDto.RegisterResponse of(String itemToken);
//
//    // retrieve
//    MallDto.Main of(MallInfo.Main main);
//
//    MallDto.ItemOptionGroupInfo of(MallInfo.ItemOptionGroupInfo itemOptionGroup);
//
    MallCommand.SearchLoanRequest of(MallDto.SearchLoanRequest request);

    MallCommand.Loan of(MallDto.Loan request);

    PageContents<MallDto.Loan> of(PageContents<MallCommand.Loan> info);

    MallDto.Loan of(MallCommand.Loan request);
}
