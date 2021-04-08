package com.example.myscrollview;

import java.util.ArrayList;
import java.util.List;

import exceldata.WordExcelReader;
import exceldata.WordVO;
import exceldata.WordExcelWriter;

public class Study {
    public static void main(String[] args) {
        // 엑셀로 쓸 데이터 생성
        List<WordVO> list = new ArrayList<WordVO>();
        list.add(new WordVO(1, "사용자1", "30"));
        list.add(new WordVO(2, "사용자2", "31"));
        list.add(new WordVO(3, "사용자3", "32" ));
        list.add(new WordVO(4, "사용자4", "33"));
        list.add(new WordVO(5, "사용자5", "34"));

        WordExcelWriter excelWriter = new WordExcelWriter();
        //xls 파일 쓰기
        excelWriter.xlsWiter(list);

        //xlsx 파일 쓰기
        excelWriter.xlsxWiter(list);

        WordExcelReader excelReader = new WordExcelReader();

        System.out.println("*****xls*****");
        List<WordVO> xlsList = excelReader.xlsToWordVOList("testWrite.xls");
        printList(xlsList );

        System.out.println("*****xlsx*****");
        List<WordVO> xlsxList = excelReader.xlsToWordVOList("testWrite.xlsx");
        printList(xlsxList );
    }

    public static void printList(List<WordVO> list) {
        WordVO vo;

        for (int i = 0; i < list.size(); i++) {
            vo = list.get(i);
            System.out.println(vo.toString());
        }
    }
}