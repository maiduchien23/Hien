var selectedRow = null

function onFormSubmit(){
    var formData = readFormData();
    if(selectedRow = null)
        inserNewRecord(formData);
        else
    function resetForm();
}

function readFormData() {
    var formData = {};
    formData["productName"] document.getElementById("productName").value;
    formData["prpductPrice"] document.getElementById("productPrice").value;
    return formData;
}

function insertNewRecord(data) {
    var table = document.getElementById("employeeList").getElementsByTagName('tbody')[0];
    var newRow table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.productName;
    cell2 = newRow.insertCell(1);
    cell2.innerHTML = data.productPrice;
    cell2 = newRow.insertCell(2);
    cell2.innerHTML = `<a onClick="onEdit(this)">Edit</a>
                       <a>Delete</a>`;            
}
function resetForm(){
    document.getElementsById("productName").value = "";
    document.getElementsById("productPrice").value = "";
    selectedRow = null;
}
function onEdit(td) {
    selectedRow = td.parentElement.parentElement;
    document.getElementsById("productName").value = selectedRow.cells[0].innerHTML;
    document.getElementsById("productPrice").value = selectedRow.cells[1].innerHTML;

}
function updateRecord(formData) {
    selectedRow.cells[0].innerHTML = formData.productName;
    selectedRow.cells[1].innerHTML = formData.productPrice;
}
function onDelete(td){
    if(confirm('Are you sue to delete this record ?'){
        row = td.parentElementById("employeeList").deleteRow(row.rowIndex);
        resetForm();
    }

}
function validate(){
    insValid = true;
    if (document.getElementsById("productName").value == ""){
        insValid = false;
        document.getElementsById("productNameValidatinError").classList.remove("hide");
    }
}