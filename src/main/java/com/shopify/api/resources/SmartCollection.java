package com.shopify.api.resources;

import com.shopify.api.common.AbstractShopifyResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@JsonRootName("smart_collection")
public class SmartCollection extends AbstractShopifyResource {
    private String bodyHtml;
    private String handle;
    private String publishedAt;
    private List<Rule> rules;
    private String sortOrder;
    private String templateSuffix;
    private String title;
    private String publishedScope;
}
