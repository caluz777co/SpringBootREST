// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#dataTable').DataTable();
});

async function loadUsers() {

    var myHeaders = new Headers();
    myHeaders.append("Accept", "application/json");
    myHeaders.append("Content-Type", "application/json");

    var requestOptions = {
      method: 'POST',
      headers: myHeaders,
      redirect: 'follow'
    };

    const resLoadEmployees = await fetch("http://localhost:8080/employee", requestOptions);
    const employees = await resLoadEmployees.json();
    const logResponse = employees != null || employees !== undefined ? 'Employees list: OK' : 'Employees list: ERROR';
    console.log(logResponse, employees);

}