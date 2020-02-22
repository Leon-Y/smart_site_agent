package cn.pinming.siteagent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentCompanyProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentCompanyProjectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdIsNull() {
            addCriterion("agent_company_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdIsNotNull() {
            addCriterion("agent_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdEqualTo(Integer value) {
            addCriterion("agent_company_id =", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdNotEqualTo(Integer value) {
            addCriterion("agent_company_id <>", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdGreaterThan(Integer value) {
            addCriterion("agent_company_id >", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_company_id >=", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdLessThan(Integer value) {
            addCriterion("agent_company_id <", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_company_id <=", value, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdIn(List<Integer> values) {
            addCriterion("agent_company_id in", values, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdNotIn(List<Integer> values) {
            addCriterion("agent_company_id not in", values, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_company_id between", value1, value2, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgentCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_company_id not between", value1, value2, "agentCompanyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIsNull() {
            addCriterion("timestamp_create is null");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIsNotNull() {
            addCriterion("timestamp_create is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateEqualTo(Date value) {
            addCriterion("timestamp_create =", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotEqualTo(Date value) {
            addCriterion("timestamp_create <>", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateGreaterThan(Date value) {
            addCriterion("timestamp_create >", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp_create >=", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateLessThan(Date value) {
            addCriterion("timestamp_create <", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateLessThanOrEqualTo(Date value) {
            addCriterion("timestamp_create <=", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIn(List<Date> values) {
            addCriterion("timestamp_create in", values, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotIn(List<Date> values) {
            addCriterion("timestamp_create not in", values, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateBetween(Date value1, Date value2) {
            addCriterion("timestamp_create between", value1, value2, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotBetween(Date value1, Date value2) {
            addCriterion("timestamp_create not between", value1, value2, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIsNull() {
            addCriterion("timestamp_modify is null");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIsNotNull() {
            addCriterion("timestamp_modify is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyEqualTo(Date value) {
            addCriterion("timestamp_modify =", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotEqualTo(Date value) {
            addCriterion("timestamp_modify <>", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyGreaterThan(Date value) {
            addCriterion("timestamp_modify >", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp_modify >=", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyLessThan(Date value) {
            addCriterion("timestamp_modify <", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyLessThanOrEqualTo(Date value) {
            addCriterion("timestamp_modify <=", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIn(List<Date> values) {
            addCriterion("timestamp_modify in", values, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotIn(List<Date> values) {
            addCriterion("timestamp_modify not in", values, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyBetween(Date value1, Date value2) {
            addCriterion("timestamp_modify between", value1, value2, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotBetween(Date value1, Date value2) {
            addCriterion("timestamp_modify not between", value1, value2, "timestampModify");
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