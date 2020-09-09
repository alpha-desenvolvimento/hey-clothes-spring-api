package com.alpha.alphadesenvolvimento.entities.response;

public class ServiceResponse {
	public String service;
	public int status;
	public String error = null;


	public ServiceResponse() {
		super();
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public class Meta {
		public ServiceResponse meta;
		public Object data;

		public Meta() {
			super();
		}

		public ServiceResponse getMeta() {
			return meta;
		}

		public void setMeta(ServiceResponse meta) {
			this.meta = meta;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

	}
}
