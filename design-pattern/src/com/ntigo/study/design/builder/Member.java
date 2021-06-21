package com.ntigo.study.design.builder;

public class Member {
    /***
     *  빌더 패턴
     *  - 생성자 인자가 많을 때는 빌더 적용을 고려하라.
     *  - Java Bean을 활용하여 명시적으로 대입할 수 있지만 Immutable 객체를 만들 수 없다.
     */

    private final int id;
    private String name;
    private String blood_type;
    private String department;

    public static class Builder {
        // requirement param
        private final int id;

        // optional param
        private String name = "미입력";
        private String blood_type = "미입력";
        private String department = "미입력";

        public Builder( int id ) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBloodType(String blood_type) {
            this.blood_type = blood_type;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }

    private Member(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.blood_type = builder.blood_type;
        this.department = builder.department;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blood_type='" + blood_type + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
