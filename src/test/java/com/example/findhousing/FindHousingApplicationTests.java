package com.example.findhousing;

import com.example.findhousing.entity.HousingList;
import com.example.findhousing.repository.FindHousingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
class FindHousingApplicationTests {

    @Autowired
    private FindHousingRepository findHousingRepository;

    @Test
    public void InsertDatas()
    {
        IntStream.rangeClosed(1,300).forEach(i -> {

            HousingList houselist = HousingList.builder()
                    .MEMO_TITLE("Title" + i)
                    .MEMO_CONTENT("Content " + i)
                    .MEMO_AUTHOR("User" + (1%10))
                    .build();
            System.out.println(findHousingRepository.save(houselist));
        });
    }

    @Test
    public void UpdateTest()
    {
        Optional<HousingList> result = findHousingRepository.findById(300L);

        if(result.isPresent()){
            HousingList houseList = result.get();

            houseList.setMemoTitle("Changed Title....");
            houseList.setContent("Changed COntent... ");

            findHousingRepository.save(houseList);
        }
    }

}
