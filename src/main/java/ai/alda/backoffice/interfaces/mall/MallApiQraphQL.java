package ai.alda.backoffice.interfaces.mall;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class MallApiQraphQL {


    @GraphQLQuery(name = "loans")
    public List<LoanModel> getLoans() {

        List<LoanModel> temp = new ArrayList<>();
        temp.add(new LoanModel() {{
            setId(1L);
            setName("DDD");
        }});

        String name = ((KeycloakPrincipal<?>) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getName();


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
//    @GraphQLMutation(name = "saveLoan")
//    public void saveLoan(String post) {
//    }

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
