src='jQuery-3.0.0.min.js'


//Here we want to retrieve information from a file and dynamically build a table with it.
//.ready is the onreadystatechange function to make sure the DOM is loaded before you try to call with ajax. 
$('#table').ready(function(e) {
console.log("Loaded");

$.ajax({
  type : "GET",
  url : "data.json",
  dataType : "json",
  success : dataNames
}).fail(function() {
  console.log("Operation Failed");
});

function dataNames(data) {
  var table = $('<table></table>');
  var th = $('<th>');
  th.text("Name: " + "Department: " + "Salary: ");
  table.append(th);
  data.forEach(function(key, value) {



    var tr = $('<tr>');
    tr.text(value);
    table.append(tr);
  for(p in key) {


    var td = $('<td>');
    td.text(key[p]);
    tr.append(td);
    th.append(tr);
  }

  });

$('#table').append(table);
}

});
