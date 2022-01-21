package ai.alda.backoffice.interfaces.mall;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface MallRecordMapper {

//    // register
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
//    MallDto.ItemOptionInfo of(MallInfo.ItemOptionInfo itemOption);


//    MallRecord.LoanSearchRequest of (MallRecord.LoanSearchRequest request);
}
