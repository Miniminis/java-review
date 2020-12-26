package com.javareview;

public class CustomExceptionTest {

    public static void run() {
        IdInputTest idInputTest = new IdInputTest();
        try {
            idInputTest.setUserId("");
        } catch (IdNotValidException e) {
            System.out.println(e);
        } catch (Exception e) {     //default exception!
            System.out.println(e);
        }
    }
}

class IdInputTest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IdNotValidException {
        if(userId == null) {
            throw new IdNotValidException("ID는 Null 일 수 없습니다!");
        } else if (userId.length() < 8 || userId.length() > 20) {
            throw new IdNotValidException("ID는 8자 이상, 20자 이하로 적어주세요.");
        }

        this.userId = userId;
    }

    @Override
    public String toString() {
        return "IdInputTest{" +
                "userId='" + userId + '\'' +
                '}';
    }
}


