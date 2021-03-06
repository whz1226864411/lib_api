package com.creat.lib.po;

import java.util.ArrayList;
import java.util.List;

public class BookItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBiIdIsNull() {
            addCriterion("bi_id is null");
            return (Criteria) this;
        }

        public Criteria andBiIdIsNotNull() {
            addCriterion("bi_id is not null");
            return (Criteria) this;
        }

        public Criteria andBiIdEqualTo(Integer value) {
            addCriterion("bi_id =", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdNotEqualTo(Integer value) {
            addCriterion("bi_id <>", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdGreaterThan(Integer value) {
            addCriterion("bi_id >", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bi_id >=", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdLessThan(Integer value) {
            addCriterion("bi_id <", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdLessThanOrEqualTo(Integer value) {
            addCriterion("bi_id <=", value, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdIn(List<Integer> values) {
            addCriterion("bi_id in", values, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdNotIn(List<Integer> values) {
            addCriterion("bi_id not in", values, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdBetween(Integer value1, Integer value2) {
            addCriterion("bi_id between", value1, value2, "biId");
            return (Criteria) this;
        }

        public Criteria andBiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bi_id not between", value1, value2, "biId");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("b_id like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("b_id not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andCodingIsNull() {
            addCriterion("coding is null");
            return (Criteria) this;
        }

        public Criteria andCodingIsNotNull() {
            addCriterion("coding is not null");
            return (Criteria) this;
        }

        public Criteria andCodingEqualTo(String value) {
            addCriterion("coding =", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotEqualTo(String value) {
            addCriterion("coding <>", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThan(String value) {
            addCriterion("coding >", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThanOrEqualTo(String value) {
            addCriterion("coding >=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThan(String value) {
            addCriterion("coding <", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThanOrEqualTo(String value) {
            addCriterion("coding <=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLike(String value) {
            addCriterion("coding like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotLike(String value) {
            addCriterion("coding not like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingIn(List<String> values) {
            addCriterion("coding in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotIn(List<String> values) {
            addCriterion("coding not in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingBetween(String value1, String value2) {
            addCriterion("coding between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotBetween(String value1, String value2) {
            addCriterion("coding not between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andBorrowIsNull() {
            addCriterion("borrow is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIsNotNull() {
            addCriterion("borrow is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowEqualTo(Boolean value) {
            addCriterion("borrow =", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowNotEqualTo(Boolean value) {
            addCriterion("borrow <>", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowGreaterThan(Boolean value) {
            addCriterion("borrow >", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("borrow >=", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowLessThan(Boolean value) {
            addCriterion("borrow <", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowLessThanOrEqualTo(Boolean value) {
            addCriterion("borrow <=", value, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowIn(List<Boolean> values) {
            addCriterion("borrow in", values, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowNotIn(List<Boolean> values) {
            addCriterion("borrow not in", values, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow between", value1, value2, "borrow");
            return (Criteria) this;
        }

        public Criteria andBorrowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow not between", value1, value2, "borrow");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}