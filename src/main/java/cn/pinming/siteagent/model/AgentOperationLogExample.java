package cn.pinming.siteagent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentOperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentOperationLogExample() {
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

        public Criteria andOperateUserIdIsNull() {
            addCriterion("operate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNotNull() {
            addCriterion("operate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdEqualTo(String value) {
            addCriterion("operate_user_id =", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotEqualTo(String value) {
            addCriterion("operate_user_id <>", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThan(String value) {
            addCriterion("operate_user_id >", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("operate_user_id >=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThan(String value) {
            addCriterion("operate_user_id <", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThanOrEqualTo(String value) {
            addCriterion("operate_user_id <=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLike(String value) {
            addCriterion("operate_user_id like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotLike(String value) {
            addCriterion("operate_user_id not like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIn(List<String> values) {
            addCriterion("operate_user_id in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotIn(List<String> values) {
            addCriterion("operate_user_id not in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdBetween(String value1, String value2) {
            addCriterion("operate_user_id between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotBetween(String value1, String value2) {
            addCriterion("operate_user_id not between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdIsNull() {
            addCriterion("operation_company_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdIsNotNull() {
            addCriterion("operation_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdEqualTo(Integer value) {
            addCriterion("operation_company_id =", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdNotEqualTo(Integer value) {
            addCriterion("operation_company_id <>", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdGreaterThan(Integer value) {
            addCriterion("operation_company_id >", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_company_id >=", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdLessThan(Integer value) {
            addCriterion("operation_company_id <", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("operation_company_id <=", value, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdIn(List<Integer> values) {
            addCriterion("operation_company_id in", values, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdNotIn(List<Integer> values) {
            addCriterion("operation_company_id not in", values, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("operation_company_id between", value1, value2, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_company_id not between", value1, value2, "operationCompanyId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdIsNull() {
            addCriterion("operation_project_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdIsNotNull() {
            addCriterion("operation_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdEqualTo(Integer value) {
            addCriterion("operation_project_id =", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdNotEqualTo(Integer value) {
            addCriterion("operation_project_id <>", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdGreaterThan(Integer value) {
            addCriterion("operation_project_id >", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_project_id >=", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdLessThan(Integer value) {
            addCriterion("operation_project_id <", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("operation_project_id <=", value, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdIn(List<Integer> values) {
            addCriterion("operation_project_id in", values, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdNotIn(List<Integer> values) {
            addCriterion("operation_project_id not in", values, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("operation_project_id between", value1, value2, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperationProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_project_id not between", value1, value2, "operationProjectId");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameIsNull() {
            addCriterion("operate_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameIsNotNull() {
            addCriterion("operate_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameEqualTo(String value) {
            addCriterion("operate_user_name =", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameNotEqualTo(String value) {
            addCriterion("operate_user_name <>", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameGreaterThan(String value) {
            addCriterion("operate_user_name >", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("operate_user_name >=", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameLessThan(String value) {
            addCriterion("operate_user_name <", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameLessThanOrEqualTo(String value) {
            addCriterion("operate_user_name <=", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameLike(String value) {
            addCriterion("operate_user_name like", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameNotLike(String value) {
            addCriterion("operate_user_name not like", value, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameIn(List<String> values) {
            addCriterion("operate_user_name in", values, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameNotIn(List<String> values) {
            addCriterion("operate_user_name not in", values, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameBetween(String value1, String value2) {
            addCriterion("operate_user_name between", value1, value2, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperateUserNameNotBetween(String value1, String value2) {
            addCriterion("operate_user_name not between", value1, value2, "operateUserName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameIsNull() {
            addCriterion("operation_company_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameIsNotNull() {
            addCriterion("operation_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameEqualTo(String value) {
            addCriterion("operation_company_name =", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameNotEqualTo(String value) {
            addCriterion("operation_company_name <>", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameGreaterThan(String value) {
            addCriterion("operation_company_name >", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_company_name >=", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameLessThan(String value) {
            addCriterion("operation_company_name <", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("operation_company_name <=", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameLike(String value) {
            addCriterion("operation_company_name like", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameNotLike(String value) {
            addCriterion("operation_company_name not like", value, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameIn(List<String> values) {
            addCriterion("operation_company_name in", values, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameNotIn(List<String> values) {
            addCriterion("operation_company_name not in", values, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameBetween(String value1, String value2) {
            addCriterion("operation_company_name between", value1, value2, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationCompanyNameNotBetween(String value1, String value2) {
            addCriterion("operation_company_name not between", value1, value2, "operationCompanyName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameIsNull() {
            addCriterion("operation_project_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameIsNotNull() {
            addCriterion("operation_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameEqualTo(String value) {
            addCriterion("operation_project_name =", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameNotEqualTo(String value) {
            addCriterion("operation_project_name <>", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameGreaterThan(String value) {
            addCriterion("operation_project_name >", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_project_name >=", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameLessThan(String value) {
            addCriterion("operation_project_name <", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameLessThanOrEqualTo(String value) {
            addCriterion("operation_project_name <=", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameLike(String value) {
            addCriterion("operation_project_name like", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameNotLike(String value) {
            addCriterion("operation_project_name not like", value, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameIn(List<String> values) {
            addCriterion("operation_project_name in", values, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameNotIn(List<String> values) {
            addCriterion("operation_project_name not in", values, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameBetween(String value1, String value2) {
            addCriterion("operation_project_name between", value1, value2, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationProjectNameNotBetween(String value1, String value2) {
            addCriterion("operation_project_name not between", value1, value2, "operationProjectName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Byte value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Byte value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Byte value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Byte value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Byte value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Byte> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Byte> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Byte value1, Byte value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailIsNull() {
            addCriterion("operation_type_detail is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailIsNotNull() {
            addCriterion("operation_type_detail is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailEqualTo(Byte value) {
            addCriterion("operation_type_detail =", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailNotEqualTo(Byte value) {
            addCriterion("operation_type_detail <>", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailGreaterThan(Byte value) {
            addCriterion("operation_type_detail >", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailGreaterThanOrEqualTo(Byte value) {
            addCriterion("operation_type_detail >=", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailLessThan(Byte value) {
            addCriterion("operation_type_detail <", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailLessThanOrEqualTo(Byte value) {
            addCriterion("operation_type_detail <=", value, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailIn(List<Byte> values) {
            addCriterion("operation_type_detail in", values, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailNotIn(List<Byte> values) {
            addCriterion("operation_type_detail not in", values, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailBetween(Byte value1, Byte value2) {
            addCriterion("operation_type_detail between", value1, value2, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationTypeDetailNotBetween(Byte value1, Byte value2) {
            addCriterion("operation_type_detail not between", value1, value2, "operationTypeDetail");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkIsNull() {
            addCriterion("operation_remark is null");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkIsNotNull() {
            addCriterion("operation_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkEqualTo(String value) {
            addCriterion("operation_remark =", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkNotEqualTo(String value) {
            addCriterion("operation_remark <>", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkGreaterThan(String value) {
            addCriterion("operation_remark >", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("operation_remark >=", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkLessThan(String value) {
            addCriterion("operation_remark <", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkLessThanOrEqualTo(String value) {
            addCriterion("operation_remark <=", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkLike(String value) {
            addCriterion("operation_remark like", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkNotLike(String value) {
            addCriterion("operation_remark not like", value, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkIn(List<String> values) {
            addCriterion("operation_remark in", values, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkNotIn(List<String> values) {
            addCriterion("operation_remark not in", values, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkBetween(String value1, String value2) {
            addCriterion("operation_remark between", value1, value2, "operationRemark");
            return (Criteria) this;
        }

        public Criteria andOperationRemarkNotBetween(String value1, String value2) {
            addCriterion("operation_remark not between", value1, value2, "operationRemark");
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