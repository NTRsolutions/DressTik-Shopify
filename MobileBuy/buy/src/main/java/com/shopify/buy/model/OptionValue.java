/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Shopify Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.shopify.buy.model;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the value of an {@link Option}.
 */
public class OptionValue {

    @SerializedName("option_id")
    private String optionId;

    private String name;

    private String value;

    public OptionValue(String optionId, String name, String value) {
        this.optionId = optionId;
        this.name = name;
        this.value = value;
    }

    /**
     * @return The unique identifier of the {@link Option} to which this value belongs.
     */
    public String getOptionId() { return optionId; }

    /**
     * @return The name (e.g. "Color", "Size", etc)
     */
    public String getName() { return name; }

    /**
     * @return The value (e.g. "Blue", "Small", etc)
     */
    public String getValue() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OptionValue)) return false;

        OptionValue that = (OptionValue) o;

        if (!optionId.equals(that.optionId)) return false;
        if (!name.equals(that.name)) return false;
        return value.equals(that.value);

    }

}
