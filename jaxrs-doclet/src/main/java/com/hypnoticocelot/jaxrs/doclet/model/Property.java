package com.hypnoticocelot.jaxrs.doclet.model;

import static com.google.common.base.Strings.emptyToNull;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {

	private String type;
	private String description;
	private PropertyItems items;
	private Boolean uniqueItems;
	private List<String> allowableValues;
	private String minimum;
	private String maximum;

	private Property() {
	}

	public Property(String type, String description, String itemsRef, String itemsType, Boolean uniqueItems, List<String> allowableValues, String minimum,
			String maximum) {
		this.type = type;
		this.description = emptyToNull(description);
		if (itemsRef != null || itemsType != null) {
			this.items = new PropertyItems(itemsRef, itemsType);
		}
		this.uniqueItems = uniqueItems;
		this.allowableValues = allowableValues;
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public String getType() {
		return this.type;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * This gets the allowableValues
	 * @return the allowableValues
	 */
	@JsonProperty("enum")
	public List<String> getAllowableValues() {
		return this.allowableValues;
	}

	/**
	 * This gets the uniqueItems
	 * @return the uniqueItems
	 */
	public Boolean getUniqueItems() {
		return this.uniqueItems;
	}

	/**
	 * This gets the items in the collection
	 * @return The items in the collection
	 */
	public PropertyItems getItems() {
		return this.items;
	}

	/**
	 * This gets the minimum value of the property
	 * @return the minimum value of the property
	 */
	public String getMinimum() {
		return this.minimum;
	}

	/**
	 * This gets the maximum value of the property
	 * @return the maximum value of the property
	 */
	public String getMaximum() {
		return this.maximum;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.allowableValues == null) ? 0 : this.allowableValues.hashCode());
		result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = prime * result + ((this.items == null) ? 0 : this.items.hashCode());
		result = prime * result + ((this.maximum == null) ? 0 : this.maximum.hashCode());
		result = prime * result + ((this.minimum == null) ? 0 : this.minimum.hashCode());
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		result = prime * result + ((this.uniqueItems == null) ? 0 : this.uniqueItems.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Property other = (Property) obj;
		if (this.allowableValues == null) {
			if (other.allowableValues != null) {
				return false;
			}
		} else if (!this.allowableValues.equals(other.allowableValues)) {
			return false;
		}
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}
		if (this.items == null) {
			if (other.items != null) {
				return false;
			}
		} else if (!this.items.equals(other.items)) {
			return false;
		}
		if (this.maximum == null) {
			if (other.maximum != null) {
				return false;
			}
		} else if (!this.maximum.equals(other.maximum)) {
			return false;
		}
		if (this.minimum == null) {
			if (other.minimum != null) {
				return false;
			}
		} else if (!this.minimum.equals(other.minimum)) {
			return false;
		}
		if (this.type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!this.type.equals(other.type)) {
			return false;
		}
		if (this.uniqueItems == null) {
			if (other.uniqueItems != null) {
				return false;
			}
		} else if (!this.uniqueItems.equals(other.uniqueItems)) {
			return false;
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Property [type=" + this.type + ", description=" + this.description + ", items=" + this.items + ", uniqueItems=" + this.uniqueItems
				+ ", allowableValues=" + this.allowableValues + ", minimum=" + this.minimum + ", maximum=" + this.maximum + "]";
	}

}
