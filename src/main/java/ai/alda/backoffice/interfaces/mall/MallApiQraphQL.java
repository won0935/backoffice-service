package ai.alda.backoffice.interfaces.mall;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
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

        return temp;
    }

    @GraphQLQuery(name = "getAllBalance")
    public List<LoanModel> getAll(final Pageable test) {


        List<LoanModel> temp = new ArrayList<>();
        temp.add(new LoanModel() {{
            setId(1L);
            setName("DDD");
        }});

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
