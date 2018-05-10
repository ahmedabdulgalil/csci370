<html>
<Head><title>step 2, take your personality test</title></Head>

<body>
User information...

<br/><br/>
the current time is <%= new java.util.Date() %>
<%= request.getParameter("firstname") %>
${param.firstname} <br/>
${param.lastname}<br/>
${param.DOB}<br/>
${param.email}<br/>
${param.state}<br/>
${param.city}<br/>
${param.phonenumber}<br/>
${param.username}<br/>
${param.password}<br/>


<br/><br/>
User quiz choices

 Q1 your picked <%= request.getParameter("Q1") %> <br/>
 Q2 your picked ${param.Q2}<br/>
 Q3 your picked ${param.Q3}<br/>
 Q4 your picked ${param.Q4}<br/>
 Q5 your picked ${param.Q5}<br/>
 Q6 your picked ${param.Q6}<br/>
 Q7 your picked ${param.Q7}<br/>
 Q8 your picked ${param.Q8}<br/>
 Q9 your picked ${param.Q9}<br/>
 Q10 your picked ${param.Q10}<br/>
 Q11 your picked ${param.Q11}<br/>
 Q12 your picked ${param.Q12}<br/>
 Q13 your picked ${param.Q13}<br/>
 Q14 your picked ${param.Q14}<br/>
 Q15 you picked ${param.Q15}


</body>
</html>