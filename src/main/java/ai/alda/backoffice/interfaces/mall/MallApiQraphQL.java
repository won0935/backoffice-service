package ai.alda.backoffice.interfaces.mall;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static ai.alda.backoffice.config.SwaggerConfig.BEARER_KEY_SECURITY_SCHEME;

@Service
@GraphQLApi
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class MallApiQraphQL {


    @GraphQLQuery(name = "loans")
    @PreAuthorize("hasAnyRole('dddd')")
    public List<LoanModel> getLoans() {

        List<LoanModel> temp =  new ArrayList<>();
        temp.add(new LoanModel(){{setId(1L);setName("DDD");}});

        return temp;
    }

    //{
    //	post(id:1){
    //		id
    //		title
    //	}
    //}
//    @GraphQLQuery(name = "loan")
//    public LoanModel getLoanById(Long id) {
//        return testClient.getLoanById(id);
//    }

    //    mutation{
//        saveLoan(post:
//        {
//            id: 343
//            name :"sss",
//            loanTagList:[
//               {
//                        type: "test1",
//                        description :"xxx"
//                }
//                {
//                        type: "test2",
//                        description :"yyy"
//                }
//                {
//                        type: "test3",
//                        description :"zzz"
//                }
//            ]
//        })
//    }
    @GraphQLMutation(name = "saveLoan")
    @PreAuthorize("hasAnyRole('dddd')")
    public void saveLoan(String post) {
    }

    //mutation{
    //	deletePost(id:1)
    //}
//    @GraphQLMutation(name = "deleteLoan")
//    public void deleteLoan(Long id) {
//        testClient.deleteLoan(id);
//    }

    //{
    //	posts{
    //		title
    //		isGood
    //	}
    //}
//    @Transactional
//    @GraphQLQuery(name = "isGood")
//    public boolean isGood(@GraphQLContext LoanModel entity) {
//        return !entity.getName().equals("title1");
//    }
}
