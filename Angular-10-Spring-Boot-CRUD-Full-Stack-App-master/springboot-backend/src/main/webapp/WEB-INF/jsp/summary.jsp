<%@ include file="fragments/header.jsp" %>

<style>
    .summary-card {
        background: #fff;
        border-radius: 10px;
        box-shadow: 0 1px 3px rgba(0,0,0,.08);
        max-width: 640px;
        overflow: hidden;
    }
    .summary-card .card-head {
        padding: 18px 22px;
        border-bottom: 1px solid #eef0f2;
    }
    .summary-card .card-head h2 { margin: 0; font-size: 18px; }
    .summary-card .card-head p { margin: 4px 0 0; font-size: 13px; }
    table.summary {
        width: 100%;
        border-collapse: collapse;
    }
    table.summary th, table.summary td {
        text-align: left;
        padding: 14px 22px;
        border-bottom: 1px solid #eef0f2;
        vertical-align: top;
    }
    table.summary tr:last-child th, table.summary tr:last-child td { border-bottom: none; }
    table.summary th {
        width: 40%;
        font-weight: 600;
        color: #495057;
    }
    table.summary td { color: #212529; }
    .source-tag {
        display: block;
        font-size: 11px;
        text-transform: uppercase;
        letter-spacing: .04em;
        color: #adb5bd;
        margin-top: 2px;
    }
</style>

<div class="summary-card">
    <div class="card-head">
        <h2>Quick Reference Summary</h2>
        <p class="muted">Read-only snapshot &mdash; one key field from each module tab.</p>
    </div>
    <table class="summary">
        <tr>
            <th>Total Employees<span class="source-tag">from Employees tab</span></th>
            <td>${summary.totalEmployees}</td>
        </tr>
        <tr>
            <th>Latest Employee<span class="source-tag">from Personal tab</span></th>
            <td><c:out value="${summary.latestEmployeeName}"/></td>
        </tr>
        <tr>
            <th>Primary Email<span class="source-tag">from Contact tab</span></th>
            <td><c:out value="${summary.primaryEmail}"/></td>
        </tr>
        <tr>
            <th>Top Department<span class="source-tag">from Departments tab</span></th>
            <td><c:out value="${summary.topDepartment}"/></td>
        </tr>
        <tr>
            <th>Total Monthly Payroll<span class="source-tag">from Payroll tab</span></th>
            <td><fmt:formatNumber value="${summary.totalMonthlyPayroll}" type="currency" currencySymbol="$"/></td>
        </tr>
    </table>
</div>

<%@ include file="fragments/footer.jsp" %>
