package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("accepts_marketing")
    private Boolean acceptsMarketing;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("orders_count")
    private Integer ordersCount;
    @JsonProperty("state")
    private String state;
    @JsonProperty("total_spent")
    private String totalSpent;
    @JsonProperty("last_order_id")
    private String lastOrderId;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("verified_email")
    private Boolean verifiedEmail;
    @JsonProperty("multipass_identifier")
    private Object multipassIdentifier;
    @JsonProperty("tax_exempt")
    private Boolean taxExempt;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("last_order_name")
    private String lastOrderName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("addresses")
    private List<GetCustomerAddressResponse> addresses = null;
    @JsonProperty("accepts_marketing_updated_at")
    private String acceptsMarketingUpdatedAt;
    @JsonProperty("marketing_opt_in_level")
    private Object marketingOptInLevel;
    @JsonProperty("tax_exemptions")
    private List<Object> taxExemptions = null;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("default_address")
    private DefaultAddress defaultAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("accepts_marketing")
    public Boolean getAcceptsMarketing() {
        return acceptsMarketing;
    }

    @JsonProperty("accepts_marketing")
    public void setAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("orders_count")
    public Integer getOrdersCount() {
        return ordersCount;
    }

    @JsonProperty("orders_count")
    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("total_spent")
    public String getTotalSpent() {
        return totalSpent;
    }

    @JsonProperty("total_spent")
    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    @JsonProperty("last_order_id")
    public String getLastOrderId() {
        return lastOrderId;
    }

    @JsonProperty("last_order_id")
    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    @JsonProperty("verified_email")
    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    @JsonProperty("verified_email")
    public void setVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    @JsonProperty("multipass_identifier")
    public Object getMultipassIdentifier() {
        return multipassIdentifier;
    }

    @JsonProperty("multipass_identifier")
    public void setMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
    }

    @JsonProperty("tax_exempt")
    public Boolean getTaxExempt() {
        return taxExempt;
    }

    @JsonProperty("tax_exempt")
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("last_order_name")
    public String getLastOrderName() {
        return lastOrderName;
    }

    @JsonProperty("last_order_name")
    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("addresses")
    public List<GetCustomerAddressResponse> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<GetCustomerAddressResponse> addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("accepts_marketing_updated_at")
    public String getAcceptsMarketingUpdatedAt() {
        return acceptsMarketingUpdatedAt;
    }

    @JsonProperty("accepts_marketing_updated_at")
    public void setAcceptsMarketingUpdatedAt(String acceptsMarketingUpdatedAt) {
        this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
    }

    @JsonProperty("marketing_opt_in_level")
    public Object getMarketingOptInLevel() {
        return marketingOptInLevel;
    }

    @JsonProperty("marketing_opt_in_level")
    public void setMarketingOptInLevel(Object marketingOptInLevel) {
        this.marketingOptInLevel = marketingOptInLevel;
    }

    @JsonProperty("tax_exemptions")
    public List<Object> getTaxExemptions() {
        return taxExemptions;
    }

    @JsonProperty("tax_exemptions")
    public void setTaxExemptions(List<Object> taxExemptions) {
        this.taxExemptions = taxExemptions;
    }

    @JsonProperty("admin_graphql_api_id")
    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    @JsonProperty("admin_graphql_api_id")
    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    @JsonProperty("default_address")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    @JsonProperty("default_address")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

