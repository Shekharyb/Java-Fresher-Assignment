<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management System</title>
    <style>
        * { box-sizing: border-box; }
        body {
            margin: 0;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
            background: #f4f6f9;
            color: #212529;
        }
        header.app-header {
            background: #0d6efd;
            color: #fff;
            padding: 18px 24px;
        }
        header.app-header h1 { margin: 0; font-size: 22px; font-weight: 600; }
        nav.tabs {
            background: #fff;
            border-bottom: 1px solid #dee2e6;
            padding: 0 24px;
        }
        nav.tabs ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
            flex-wrap: wrap;
        }
        nav.tabs li a {
            display: block;
            padding: 14px 18px;
            text-decoration: none;
            color: #495057;
            font-weight: 500;
            border-bottom: 3px solid transparent;
        }
        nav.tabs li a:hover { color: #0d6efd; }
        nav.tabs li a.active {
            color: #0d6efd;
            border-bottom-color: #0d6efd;
        }
        main.container { padding: 24px; max-width: 1000px; margin: 0 auto; }
        h2.page-title { font-size: 20px; margin: 0 0 16px; }
        table.data {
            width: 100%;
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 1px 3px rgba(0,0,0,.08);
            border-radius: 8px;
            overflow: hidden;
        }
        table.data th, table.data td {
            text-align: left;
            padding: 12px 16px;
            border-bottom: 1px solid #eef0f2;
        }
        table.data th { background: #f8f9fa; font-size: 13px; text-transform: uppercase; letter-spacing: .03em; color: #6c757d; }
        table.data tr:last-child td { border-bottom: none; }
        .muted { color: #6c757d; }
    </style>
</head>
<body>
<header class="app-header">
    <h1>Employee Management System</h1>
</header>
<nav class="tabs">
    <ul>
        <li><a href="<c:url value='/employees'/>" class="${activeTab == 'employees' ? 'active' : ''}">Employees</a></li>
        <li><a href="<c:url value='/personal'/>" class="${activeTab == 'personal' ? 'active' : ''}">Personal</a></li>
        <li><a href="<c:url value='/contact'/>" class="${activeTab == 'contact' ? 'active' : ''}">Contact</a></li>
        <li><a href="<c:url value='/departments'/>" class="${activeTab == 'departments' ? 'active' : ''}">Departments</a></li>
        <li><a href="<c:url value='/payroll'/>" class="${activeTab == 'payroll' ? 'active' : ''}">Payroll</a></li>
        <li><a href="<c:url value='/summary'/>" class="${activeTab == 'summary' ? 'active' : ''}">Summary</a></li>
    </ul>
</nav>
<main class="container">
