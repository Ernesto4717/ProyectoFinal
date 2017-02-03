<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div data-ng-controller="homeController">
<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Academy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a data-ng-href="/jpaproject/home">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Cart<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a data-ng-href="/jpaproject/Cart/home">Home</a></li>
          <li><a data-ng-href="/jpaproject/Cart/List">List</a></li>
          <li><a  data-ng-href="/jpaproject/Cart/create">Create</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">User<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a data-ng-href="/jpaproject/User/home">Home</a></li>
          <li><a data-ng-href="/jpaproject/User/List">List</a></li>
          <li><a  data-ng-href="/jpaproject/User/create">Create</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Item<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a data-ng-href="/jpaproject/Item/home">Home</a></li>
          <li><a data-ng-href="/jpaproject/Item/list">List</a></li>
          <li><a  data-ng-href="/jpaproject/Item/create">Create</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
</div>
  
