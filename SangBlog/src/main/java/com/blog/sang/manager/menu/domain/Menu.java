package com.blog.sang.manager.menu.domain;

public class Menu {
	private Long id;
	private Long parentId;
	private String menuLevel;
	private String menuCode;
	private String menuName;
	private String ordering;
	private String url;
	private String uri;
	private String menuDisplay;
	
	private Long childId;
	private Long childParentId;
	private String childMenuLevel;
	private String childMenuCode;
	private String childMenuName;
	private String childOrdering;
	private String childUrl;
	private String childUri;
	private String childMenuDisplay;
	
	// private List<Menu> childMenu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getMenuLevel() {
		return menuLevel;
	}
	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getOrdering() {
		return ordering;
	}
	public void setOrdering(String ordering) {
		this.ordering = ordering;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	/*public List<Menu> getChildMenu() {
		return childMenu;
	}
	public void setChildMenu(List<Menu> childMenu) {
		this.childMenu = childMenu;
	}*/
	public String getMenuDisplay() {
		return menuDisplay;
	}
	public void setMenuDisplay(String menuDisplay) {
		this.menuDisplay = menuDisplay;
	}
	public Long getChildId() {
		return childId;
	}
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	public Long getChildParentId() {
		return childParentId;
	}
	public void setChildParentId(Long childParentId) {
		this.childParentId = childParentId;
	}
	public String getChildMenuLevel() {
		return childMenuLevel;
	}
	public void setChildMenuLevel(String childMenuLevel) {
		this.childMenuLevel = childMenuLevel;
	}
	public String getChildMenuCode() {
		return childMenuCode;
	}
	public void setChildMenuCode(String childMenuCode) {
		this.childMenuCode = childMenuCode;
	}
	public String getChildMenuName() {
		return childMenuName;
	}
	public void setChildMenuName(String childMenuName) {
		this.childMenuName = childMenuName;
	}
	public String getChildOrdering() {
		return childOrdering;
	}
	public void setChildOrdering(String childOrdering) {
		this.childOrdering = childOrdering;
	}
	public String getChildUrl() {
		return childUrl;
	}
	public void setChildUrl(String childUrl) {
		this.childUrl = childUrl;
	}
	public String getChildUri() {
		return childUri;
	}
	public void setChildUri(String childUri) {
		this.childUri = childUri;
	}
	public String getChildMenuDisplay() {
		return childMenuDisplay;
	}
	public void setChildMenuDisplay(String childMenuDisplay) {
		this.childMenuDisplay = childMenuDisplay;
	}
	
	
	
}
