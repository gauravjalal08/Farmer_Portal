<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Results</title>
    
    
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #d8efd2;
        }

        .btn-submit {
            background-color: #29ac2d;
            color: white;
            width: 130px; /* Adjust width as needed */
            height: 40px; /*
            }
    </style>
</head>
<body>
    <div class="container">
        <h2>Policy Details:</h2>
        <table>
            <thead>
                <tr>
                    <th>State</th>
                    <th>Product</th>
                    <th>Season</th>
                    <th>Year</th>
                    <th>Party Name</th>
                    <th>Policy Number</th>
                    <th>Policy Status</th>
                    <th>Farmer Name</th>
                    <th>Crop Name</th>
                    <th>Area Insured (Ha)</th>
                    <th>Premium Amount</th>
                    <th>Sum Insured</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="row : ${main_result}">
                    <td th:text="${row.CM_STATE_NAME}"></td>
                    <td th:text="${row.PRODUCT_CD}"></td>
                    <td th:text="${row.CROP_SEASON_NAME}"></td>
                    <td th:text="${row.YEAR_CD}"></td>
                    <td th:text="${row.PARTY_NAME}"></td>
                    <td th:text="${row.POLICY_NUMBER}"></td>
                    <td th:text="${row.POLICY_STATUS_CD}"></td>
                    <td th:text="${row.ACCOUNT_HOLDER_NAME}"></td>
                    <td th:text="${row.CROP_NAME}"></td>
                    <td th:text="${row.AREA_INSURED_HA}"></td>
                    <td th:text="${row.NET_PREMIUM_AMOUNT}"></td>
                    <td th:text="${row.TOTAL_SUM_INSURED}"></td>
                </tr>
            </tbody>
        </table>

        <h2>Account Details:</h2>
        <table>
            <thead>
                <tr>
                    <th>IFSC CODE</th>
                    <th>Bank Name</th>
                    <th>Branch Name</th>
                    <th>Bank A/c No</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="row : ${main_result}">
                    <td th:text="${row.IFS_CD}"></td>
                    <td th:text="${row.BANK_NAME}"></td>
                    <td th:text="${row.BRANCH_NAME}"></td>
                    <td th:text="${row.BANK_ACCOUNT_NUMBER}"></td>
                </tr>
            </tbody>
        </table>

        <h2>Claim Details:</h2>
        <table>
            <thead>
                <tr>
                    <th>Claim Type</th>
                    <th>Claim Amount</th>
                    <th>Claim Approved Date</th>
                    <th>Claim Status</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="row : ${claim_result}">
                    <td th:text="${row.CL_CLAIM_TYPE_CD}"></td>
                    <td th:text="${row.CL_CLAIM_APPROVED_AMOUNT}"></td>
                    <td th:text="${row.CL_APPRV_DATE}"></td>
                    <td th:text="${row.CLAIM_STATUS_CD}"></td>
                </tr>
            </tbody>
        </table>

        <!-- Display error message if any -->
        <p th:if="${error_message}" th:text="${error_message}"></p>

        <br>
        <button class="btn-submit" onclick="goBack()">Back to Search</button>
    </div>

    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>
