<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-sm-9">
	<div class="well">
		<div class="row">
			<c:forEach var="paycheck" items="${homeView.yearSummaryList}">
				<div class="col-sm-3 col-md-3">
					<div class="thumbnail">
						<div class="caption">
							<h2 style="text-align: center">${paycheck.year}</h2>
						</div>
						<div class="modal-footer" style="text-align: left">
							<div class="progress">
							    <div class="progress-bar progress-bar-info" style="width:${paycheck.yearProgress}%">
							    	<span class="white-text">${paycheck.yearProgress}% Complete</span>
							    </div>
  							</div>
							<div class="row-fluid">
								<div class="span4">
									<b>Gross: </b><small>${paycheck.grossAmount}</small>
								</div>
								<div class="span4">
									<b>Net: </b><small>${paycheck.netPay}</small>
								</div>
								<div class="span4">
									<b>Reimb.: </b><small>${paycheck.reimbursement}</small>
								</div>
								<div class="span4">
									<b>Real Net: </b><small>${paycheck.netPayReal}</small>
								</div>
								<div class="span4">
									<b>Real Net Mean: </b><small>${paycheck.netPayRealMean}</small>
								</div>
								<div>
									<a href="<c:url value='/paychecks-${paycheck.year}' />" class="btn btn-danger btn-custom">Details</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>
